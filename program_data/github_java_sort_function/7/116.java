 
    public static void sort(Comparable[] a) {
        int N = a.length;

        
        int h = 1;
        while (h < N/3) h = 3*h + 1; 

        while (h >= 1) {
            
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            assert isHsorted(a, h); 
            h /= 3;
        }
        assert isSorted(a);
    }


