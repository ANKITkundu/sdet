package groovy

class Activity1a {
	static void main(def args) {
		def List=[11,2,19,5,"Mango","Apple","waterMelon"]
		def intlist=List.minus(["Mango","Apple","waterMelon"])
		println(intlist.sort())
		def strlist=List.minus(intlist)
		println(strlist.sort())
		
		
		
		}
}

