# Read from the file file.txt and output all valid phone numbers to stdout.
grep -E '^(\([0-9]{3}\) [0-9]{3}-[0-9]{4}|[0-9]{3}-[0-9]{3}-[0-9]{4})$' file.txt
# grep to search pattern
# E for evaluate regex expression
# ^ for start of the string
# $ end of the string
# \( to include ( as its also an expression
# [0 - 9]{3} 0-9 * 3 times 
