class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        i=0
        a="abcdefghijklmnopqrstuvwxyz"
        for i in range (0,26):
            if(a[i] not in sentence):
                return False
        else:
            return True
