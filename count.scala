 val text = sc.textFile("saeyum.txt") 

 val count = text.flatMap(line => line.split(" ")

 ).map(word => (word,1)).reduceByKey(_+_) .count()
