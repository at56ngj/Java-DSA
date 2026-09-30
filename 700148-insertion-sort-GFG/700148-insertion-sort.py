class Solution:
    def insertionSort(self, nums):
        # code here
        n=len(nums)
        for i in range(1,n):
            key=nums[i] #jo elemnt insert karna hai
            j=i-1
            #key se bade elements ko right shift karo
            while j>=0 and nums[j]>key :
                nums[j+1]=nums[j]
                j=j-1
            nums[j+1]=key
        return nums
            

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna