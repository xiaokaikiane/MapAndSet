import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyconcurrentHashMap <K,V>extends HashMap<K,V> {
    //读读不互斥,读写互斥,写写互斥
    private ReentrantReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock readLock=readWriteLock.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock=readWriteLock.writeLock();

    @Override
    public V get(Object key) {
        try {
            readLock.lock();
            return super.get(key);
        }finally {
            readLock.unlock();
        }
    }

    @Override
    public V put(K key, V value) {
        try {
            writeLock.lock();
            return super.put(key, value);
        }finally {
            writeLock.unlock();
        }
    }

    @Override
    public V remove(Object key) {
        try {
            writeLock.lock();
            return super.remove(key);
        }finally {
            writeLock.unlock();
        }
    }
}
