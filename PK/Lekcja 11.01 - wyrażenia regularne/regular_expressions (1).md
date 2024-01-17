# Task1
/([\w\-\.]+)@([\w\-]{2,})\.([\w\-\.]+)/gm
# Task 2
/(\+?\d{1,4})?[ _\.-]?(\(?\d{3}\)?)[ _\.-]?(\d{3}[ _\.-]?)(\d{4})/gm
# Task 3
regex below will work only for poland postal codes
/\b(\d{2})[-]?(\d{3})\b/gm
# Task 4
/\b(?:http:\/\/|https:\/\/)\S+/gm
# Task 5
/\b(0[1-9]|1[0-2])\/(0[1-9]|[12][0-9]|3[01])\/(\d{4})\b/gm
# Task 6
/\b(?:ORD|INV)[- _]?\d{4,6}\b/gm