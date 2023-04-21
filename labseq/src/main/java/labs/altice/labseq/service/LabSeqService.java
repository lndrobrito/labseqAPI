package labs.altice.labseq.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class LabSeqService {
	
    private Map<Integer, Integer> cache = new HashMap<>();

    public int getLabseq(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("n must be a non-negative integer");
            }
            
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 0;
            } else if (n == 3) {
                return 1;
            } else {
                int value;
                if (cache.containsKey(n)) {
                    value = cache.get(n);
                } else {
                    value = getLabseq(n - 4) + getLabseq(n - 3);
                    cache.put(n, value);
                }
                return value;
            }
        }
}