package Practice.Combined;
import java.lang.management.*;
public class AllInfoOfGC {



        public static void main(String[] args) {

            // Heap Memory Info
            MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
            MemoryUsage heap = memoryMXBean.getHeapMemoryUsage();

            System.out.println("Heap Used: " + heap.getUsed() / (1024 * 1024) + " MB");
            System.out.println("Heap Max: " + heap.getMax() / (1024 * 1024) + " MB");

            System.out.println("\n--- Memory Pools (Young / Old) ---");

            for (MemoryPoolMXBean pool : ManagementFactory.getMemoryPoolMXBeans()) {
                System.out.println("Name: " + pool.getName());
                System.out.println("Used: " + pool.getUsage().getUsed() / (1024 * 1024) + " MB");
                System.out.println("------------------------");
            }

            System.out.println("\n--- GC Info ---");

            for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
                System.out.println("GC Name: " + gc.getName());
                System.out.println("GC Count: " + gc.getCollectionCount());
                System.out.println("GC Time: " + gc.getCollectionTime() + " ms");
                System.out.println("------------------------");
            }
        }
    }

