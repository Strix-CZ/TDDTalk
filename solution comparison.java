
    public boolean isFair(int[] nums) {
        int sum = 0;
        boolean even = true;
        
        for (int i=0; i<nums.length; ++i) {
            sum += even ? nums[i] : -nums[i];
            even = !even;
        }
        
        return sum == 0;
    }

--------------------------------------------------------

    public boolean isFair(int[] values)
    {
        int evenMinusOddSum = 0;
        for (int value : values)
            evenMinusOddSum = value - evenMinusOddSum;

        return evenMinusOddSum == 0;
    }
