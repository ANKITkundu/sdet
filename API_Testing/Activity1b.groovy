package groovy;

class Activity1b {
	static void main (def args) {
		File file = new File("C:/Users/AnkitKundu/eclipse-workspace/IBM Groovy Project/src/groovy/out.txt");
		file.createNewFile();
		file.write("A quick brown Fox jumped over the lazy Cow\n")
		file.append("John Jimbo jingeled happily ever after\n")
		file.append("Th1\$ 1\$ v3ry c0nfus1ng\n")
		println "Matching Operations:"
		file.eachLine {
			line ->
			if (line =~ /Cow$/) {
				println "Line that ends with 'Cow' is: $line"
			}
		}
		file.eachLine {
			line ->
			if (line =~ /^J/) {
				println"Line that starts with 'J' is: $line"
			}
		}
		file.eachLine{
			line ->
			if(line =~ /.*(\d+).*/) {
				println"Line that has two adjacent numbers is: $line"
			}
		}
		println"Matching paterns:"
		def match1 = file.text =~ /\S+er/
		println "Strings matching '/\\S+er/' are: ${match1.findAll()}"
		def match2 = file.text =~ /\S*\d\W/
		println"Strings matching '/\\S*\\d\\W/' are: ${match2.findAll()}"
	}
}

