package geneticAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	private Map<Vertex, List<Vertex>> adjVertices;

	public Graph() {
		super();
		this.adjVertices = new LinkedHashMap<Vertex, List<Vertex>>();
	}

	public Map<Vertex, List<Vertex>> getAdjVertices() {
		return adjVertices;
	}

	public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
		this.adjVertices = adjVertices;
	}

	public int verticesSize() {
		return adjVertices.size();
	}

	public void addVertex(String label) {
		adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
	}

	public void removeVertex(String label) {
		Vertex v = new Vertex(label);
		adjVertices.values().stream().forEach(e -> e.remove(v));
		adjVertices.remove(new Vertex(label));
	}

	public void addEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}

	public void removeEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		List<Vertex> eV1 = adjVertices.get(v1);
		List<Vertex> eV2 = adjVertices.get(v2);
		if (eV1 != null)
			eV1.remove(v2);
		if (eV2 != null)
			eV2.remove(v1);
	}

	public List<Vertex> getAdjVertices(String label) {
		return adjVertices.get(new Vertex(label));
	}

	public Graph createGraph() {
		Graph graph = new Graph();
		graph.addVertex("Bob0");
		graph.addVertex("Bob1");
		graph.addVertex("Bob2");
		graph.addVertex("Bob3");
		graph.addVertex("Bob4");
		graph.addVertex("Bob5");
		graph.addVertex("Bob6");
		graph.addVertex("Bob7");
		graph.addVertex("Bob8");
		graph.addVertex("Bob9");
		graph.addVertex("Bob10");
		graph.addVertex("Bob11");
		graph.addVertex("Bob12");
		graph.addVertex("Bob13");
		graph.addVertex("Bob14");
		graph.addVertex("Bob15");
		graph.addVertex("Bob16");
		graph.addVertex("Bob17");
		graph.addVertex("Bob18");
		graph.addVertex("Bob19");
		graph.addVertex("Bob20");
		graph.addVertex("Bob21");
		graph.addVertex("Bob22");
		graph.addVertex("Bob23");
		graph.addVertex("Bob24");
		graph.addVertex("Bob25");
		graph.addVertex("Bob26");
		graph.addVertex("Bob27");
		graph.addVertex("Bob28");
		graph.addVertex("Bob29");
		graph.addVertex("Bob30");
		graph.addVertex("Bob31");
		graph.addVertex("Bob32");
		graph.addVertex("Bob33");
		graph.addVertex("Bob34");
		graph.addVertex("Bob35");
		graph.addVertex("Bob36");
		graph.addVertex("Bob37");
		graph.addVertex("Bob38");
		graph.addVertex("Bob39");
		graph.addVertex("Bob40");
		graph.addVertex("Bob41");
		graph.addVertex("Bob42");
		graph.addVertex("Bob43");
		graph.addVertex("Bob44");
		graph.addVertex("Bob45");
		graph.addVertex("Bob46");
		graph.addVertex("Bob47");
		graph.addVertex("Bob48");
		graph.addVertex("Bob49");
		graph.addVertex("Bob50");
		graph.addVertex("Bob51");
		graph.addVertex("Bob52");
		graph.addVertex("Bob53");
		graph.addVertex("Bob54");
		graph.addVertex("Bob55");
		graph.addVertex("Bob56");
		graph.addVertex("Bob57");
		graph.addVertex("Bob58");
		graph.addVertex("Bob59");
		graph.addVertex("Bob60");
		graph.addVertex("Bob61");
		graph.addVertex("Bob62");
		graph.addVertex("Bob63");
		graph.addVertex("Bob64");
		graph.addVertex("Bob65");
		graph.addVertex("Bob66");
		graph.addVertex("Bob67");
		graph.addVertex("Bob68");
		graph.addVertex("Bob69");
		graph.addVertex("Bob70");
		graph.addVertex("Bob71");
		graph.addVertex("Bob72");
		graph.addVertex("Bob73");
		graph.addVertex("Bob74");
		graph.addVertex("Bob75");
		graph.addVertex("Bob76");
		graph.addVertex("Bob77");
		graph.addVertex("Bob78");
		graph.addVertex("Bob79");
		graph.addVertex("Bob80");
		graph.addVertex("Bob81");
		graph.addVertex("Bob82");
		graph.addVertex("Bob83");
		graph.addVertex("Bob84");
		graph.addVertex("Bob85");
		graph.addVertex("Bob86");
		graph.addVertex("Bob87");
		graph.addVertex("Bob88");
		graph.addVertex("Bob89");
		graph.addVertex("Bob90");
		graph.addVertex("Bob91");
		graph.addVertex("Bob92");
		graph.addVertex("Bob93");
		graph.addVertex("Bob94");
		graph.addVertex("Bob95");
		graph.addVertex("Bob96");
		graph.addVertex("Bob97");
		graph.addVertex("Bob98");
		graph.addVertex("Bob99");
		graph.addVertex("Bob100");
		graph.addVertex("Bob101");
		graph.addVertex("Bob102");
		graph.addVertex("Bob103");
		graph.addVertex("Bob104");
		graph.addVertex("Bob105");
		graph.addVertex("Bob106");
		graph.addVertex("Bob107");
		graph.addVertex("Bob108");
		graph.addVertex("Bob109");
		graph.addVertex("Bob110");
		graph.addVertex("Bob111");
		graph.addVertex("Bob112");
		graph.addVertex("Bob113");
		graph.addVertex("Bob114");
		graph.addVertex("Bob115");
		graph.addVertex("Bob116");
		graph.addVertex("Bob117");
		graph.addVertex("Bob118");
		graph.addVertex("Bob119");
		graph.addVertex("Bob120");
		graph.addVertex("Bob121");
		graph.addVertex("Bob122");
		graph.addVertex("Bob123");
		graph.addVertex("Bob124");
		graph.addVertex("Bob125");
		graph.addVertex("Bob126");
		graph.addVertex("Bob127");
		graph.addVertex("Bob128");
		graph.addVertex("Bob129");
		graph.addVertex("Bob130");
		graph.addVertex("Bob131");
		graph.addVertex("Bob132");
		graph.addVertex("Bob133");
		graph.addVertex("Bob134");
		graph.addVertex("Bob135");
		graph.addVertex("Bob136");
		graph.addVertex("Bob137");
		graph.addVertex("Bob138");
		graph.addVertex("Bob139");
		graph.addVertex("Bob140");
		graph.addVertex("Bob141");
		graph.addVertex("Bob142");
		graph.addVertex("Bob143");
		graph.addVertex("Bob144");
		graph.addVertex("Bob145");
		graph.addVertex("Bob146");
		graph.addVertex("Bob147");
		graph.addVertex("Bob148");
		graph.addVertex("Bob149");
		graph.addVertex("Bob150");
		graph.addVertex("Bob151");
		graph.addVertex("Bob152");
		graph.addVertex("Bob153");
		graph.addVertex("Bob154");
		graph.addVertex("Bob155");
		graph.addVertex("Bob156");
		graph.addVertex("Bob157");
		graph.addVertex("Bob158");
		graph.addVertex("Bob159");
		graph.addVertex("Bob160");
		graph.addVertex("Bob161");
		graph.addVertex("Bob162");
		graph.addVertex("Bob163");
		graph.addVertex("Bob164");
		graph.addVertex("Bob165");
		graph.addVertex("Bob166");
		graph.addVertex("Bob167");
		graph.addVertex("Bob168");
		graph.addVertex("Bob169");
		graph.addVertex("Bob170");
		graph.addVertex("Bob171");
		graph.addVertex("Bob172");
		graph.addVertex("Bob173");
		graph.addVertex("Bob174");
		graph.addVertex("Bob175");
		graph.addVertex("Bob176");
		graph.addVertex("Bob177");
		graph.addVertex("Bob178");
		graph.addVertex("Bob179");
		graph.addVertex("Bob180");
		graph.addVertex("Bob181");
		graph.addVertex("Bob182");
		graph.addVertex("Bob183");
		graph.addVertex("Bob184");
		graph.addVertex("Bob185");
		graph.addVertex("Bob186");
		graph.addVertex("Bob187");
		graph.addVertex("Bob188");
		graph.addVertex("Bob189");
		graph.addVertex("Bob190");
		graph.addVertex("Bob191");
		graph.addVertex("Bob192");
		graph.addVertex("Bob193");
		graph.addVertex("Bob194");
		graph.addVertex("Bob195");
		graph.addVertex("Bob196");
		graph.addVertex("Bob197");
		graph.addVertex("Bob198");
		graph.addVertex("Bob199");
		graph.addVertex("Bob");
		graph.addVertex("Alice");
		graph.addVertex("Mark");
		graph.addVertex("Rob");
		graph.addVertex("Maria");
		graph.addEdge("Bob", "Alice");
		graph.addEdge("Bob", "Rob");
		graph.addEdge("Alice", "Mark");
		graph.addEdge("Rob", "Mark");
		graph.addEdge("Alice", "Maria");
		graph.addEdge("Rob", "Maria");
		graph.addEdge("Bob0", "Bob2");
		graph.addEdge("Bob0", "Bob3");
		graph.addEdge("Bob3", "Bob5");
		graph.addEdge("Bob2", "Bob6");
		graph.addEdge("Bob1", "Bob3");
		graph.addEdge("Bob1", "Bob4");
		graph.addEdge("Bob4", "Bob6");
		graph.addEdge("Bob3", "Bob7");
		graph.addEdge("Bob2", "Bob4");
		graph.addEdge("Bob2", "Bob5");
		graph.addEdge("Bob5", "Bob7");
		graph.addEdge("Bob4", "Bob8");
		graph.addEdge("Bob3", "Bob5");
		graph.addEdge("Bob3", "Bob6");
		graph.addEdge("Bob6", "Bob8");
		graph.addEdge("Bob5", "Bob9");
		graph.addEdge("Bob4", "Bob6");
		graph.addEdge("Bob4", "Bob7");
		graph.addEdge("Bob7", "Bob9");
		graph.addEdge("Bob6", "Bob10");
		graph.addEdge("Bob5", "Bob7");
		graph.addEdge("Bob5", "Bob8");
		graph.addEdge("Bob8", "Bob10");
		graph.addEdge("Bob7", "Bob11");
		graph.addEdge("Bob6", "Bob8");
		graph.addEdge("Bob6", "Bob9");
		graph.addEdge("Bob9", "Bob11");
		graph.addEdge("Bob8", "Bob12");
		graph.addEdge("Bob7", "Bob9");
		graph.addEdge("Bob7", "Bob10");
		graph.addEdge("Bob10", "Bob12");
		graph.addEdge("Bob9", "Bob13");
		graph.addEdge("Bob8", "Bob10");
		graph.addEdge("Bob8", "Bob11");
		graph.addEdge("Bob11", "Bob13");
		graph.addEdge("Bob10", "Bob14");
		graph.addEdge("Bob9", "Bob11");
		graph.addEdge("Bob9", "Bob12");
		graph.addEdge("Bob12", "Bob14");
		graph.addEdge("Bob11", "Bob15");
		graph.addEdge("Bob10", "Bob12");
		graph.addEdge("Bob10", "Bob13");
		graph.addEdge("Bob13", "Bob15");
		graph.addEdge("Bob12", "Bob16");
		graph.addEdge("Bob11", "Bob13");
		graph.addEdge("Bob11", "Bob14");
		graph.addEdge("Bob14", "Bob16");
		graph.addEdge("Bob13", "Bob17");
		graph.addEdge("Bob12", "Bob14");
		graph.addEdge("Bob12", "Bob15");
		graph.addEdge("Bob15", "Bob17");
		graph.addEdge("Bob14", "Bob18");
		graph.addEdge("Bob13", "Bob15");
		graph.addEdge("Bob13", "Bob16");
		graph.addEdge("Bob16", "Bob18");
		graph.addEdge("Bob15", "Bob19");
		graph.addEdge("Bob14", "Bob16");
		graph.addEdge("Bob14", "Bob17");
		graph.addEdge("Bob17", "Bob19");
		graph.addEdge("Bob16", "Bob20");
		graph.addEdge("Bob15", "Bob17");
		graph.addEdge("Bob15", "Bob18");
		graph.addEdge("Bob18", "Bob20");
		graph.addEdge("Bob17", "Bob21");
		graph.addEdge("Bob16", "Bob18");
		graph.addEdge("Bob16", "Bob19");
		graph.addEdge("Bob19", "Bob21");
		graph.addEdge("Bob18", "Bob22");
		graph.addEdge("Bob17", "Bob19");
		graph.addEdge("Bob17", "Bob20");
		graph.addEdge("Bob20", "Bob22");
		graph.addEdge("Bob19", "Bob23");
		graph.addEdge("Bob18", "Bob20");
		graph.addEdge("Bob18", "Bob21");
		graph.addEdge("Bob21", "Bob23");
		graph.addEdge("Bob20", "Bob24");
		graph.addEdge("Bob19", "Bob21");
		graph.addEdge("Bob19", "Bob22");
		graph.addEdge("Bob22", "Bob24");
		graph.addEdge("Bob21", "Bob25");
		graph.addEdge("Bob20", "Bob22");
		graph.addEdge("Bob20", "Bob23");
		graph.addEdge("Bob23", "Bob25");
		graph.addEdge("Bob22", "Bob26");
		graph.addEdge("Bob21", "Bob23");
		graph.addEdge("Bob21", "Bob24");
		graph.addEdge("Bob24", "Bob26");
		graph.addEdge("Bob23", "Bob27");
		graph.addEdge("Bob22", "Bob24");
		graph.addEdge("Bob22", "Bob25");
		graph.addEdge("Bob25", "Bob27");
		graph.addEdge("Bob24", "Bob28");
		graph.addEdge("Bob23", "Bob25");
		graph.addEdge("Bob23", "Bob26");
		graph.addEdge("Bob26", "Bob28");
		graph.addEdge("Bob25", "Bob29");
		graph.addEdge("Bob24", "Bob26");
		graph.addEdge("Bob24", "Bob27");
		graph.addEdge("Bob27", "Bob29");
		graph.addEdge("Bob26", "Bob30");
		graph.addEdge("Bob25", "Bob27");
		graph.addEdge("Bob25", "Bob28");
		graph.addEdge("Bob28", "Bob30");
		graph.addEdge("Bob27", "Bob31");
		graph.addEdge("Bob26", "Bob28");
		graph.addEdge("Bob26", "Bob29");
		graph.addEdge("Bob29", "Bob31");
		graph.addEdge("Bob28", "Bob32");
		graph.addEdge("Bob27", "Bob29");
		graph.addEdge("Bob27", "Bob30");
		graph.addEdge("Bob30", "Bob32");
		graph.addEdge("Bob29", "Bob33");
		graph.addEdge("Bob28", "Bob30");
		graph.addEdge("Bob28", "Bob31");
		graph.addEdge("Bob31", "Bob33");
		graph.addEdge("Bob30", "Bob34");
		graph.addEdge("Bob29", "Bob31");
		graph.addEdge("Bob29", "Bob32");
		graph.addEdge("Bob32", "Bob34");
		graph.addEdge("Bob31", "Bob35");
		graph.addEdge("Bob30", "Bob32");
		graph.addEdge("Bob30", "Bob33");
		graph.addEdge("Bob33", "Bob35");
		graph.addEdge("Bob32", "Bob36");
		graph.addEdge("Bob31", "Bob33");
		graph.addEdge("Bob31", "Bob34");
		graph.addEdge("Bob34", "Bob36");
		graph.addEdge("Bob33", "Bob37");
		graph.addEdge("Bob32", "Bob34");
		graph.addEdge("Bob32", "Bob35");
		graph.addEdge("Bob35", "Bob37");
		graph.addEdge("Bob34", "Bob38");
		graph.addEdge("Bob33", "Bob35");
		graph.addEdge("Bob33", "Bob36");
		graph.addEdge("Bob36", "Bob38");
		graph.addEdge("Bob35", "Bob39");
		graph.addEdge("Bob34", "Bob36");
		graph.addEdge("Bob34", "Bob37");
		graph.addEdge("Bob37", "Bob39");
		graph.addEdge("Bob36", "Bob40");
		graph.addEdge("Bob35", "Bob37");
		graph.addEdge("Bob35", "Bob38");
		graph.addEdge("Bob38", "Bob40");
		graph.addEdge("Bob37", "Bob41");
		graph.addEdge("Bob36", "Bob38");
		graph.addEdge("Bob36", "Bob39");
		graph.addEdge("Bob39", "Bob41");
		graph.addEdge("Bob38", "Bob42");
		graph.addEdge("Bob37", "Bob39");
		graph.addEdge("Bob37", "Bob40");
		graph.addEdge("Bob40", "Bob42");
		graph.addEdge("Bob39", "Bob43");
		graph.addEdge("Bob38", "Bob40");
		graph.addEdge("Bob38", "Bob41");
		graph.addEdge("Bob41", "Bob43");
		graph.addEdge("Bob40", "Bob44");
		graph.addEdge("Bob39", "Bob41");
		graph.addEdge("Bob39", "Bob42");
		graph.addEdge("Bob42", "Bob44");
		graph.addEdge("Bob41", "Bob45");
		graph.addEdge("Bob40", "Bob42");
		graph.addEdge("Bob40", "Bob43");
		graph.addEdge("Bob43", "Bob45");
		graph.addEdge("Bob42", "Bob46");
		graph.addEdge("Bob41", "Bob43");
		graph.addEdge("Bob41", "Bob44");
		graph.addEdge("Bob44", "Bob46");
		graph.addEdge("Bob43", "Bob47");
		graph.addEdge("Bob42", "Bob44");
		graph.addEdge("Bob42", "Bob45");
		graph.addEdge("Bob45", "Bob47");
		graph.addEdge("Bob44", "Bob48");
		graph.addEdge("Bob43", "Bob45");
		graph.addEdge("Bob43", "Bob46");
		graph.addEdge("Bob46", "Bob48");
		graph.addEdge("Bob45", "Bob49");
		graph.addEdge("Bob44", "Bob46");
		graph.addEdge("Bob44", "Bob47");
		graph.addEdge("Bob47", "Bob49");
		graph.addEdge("Bob46", "Bob50");
		graph.addEdge("Bob45", "Bob47");
		graph.addEdge("Bob45", "Bob48");
		graph.addEdge("Bob48", "Bob50");
		graph.addEdge("Bob47", "Bob51");
		graph.addEdge("Bob46", "Bob48");
		graph.addEdge("Bob46", "Bob49");
		graph.addEdge("Bob49", "Bob51");
		graph.addEdge("Bob48", "Bob52");
		graph.addEdge("Bob47", "Bob49");
		graph.addEdge("Bob47", "Bob50");
		graph.addEdge("Bob50", "Bob52");
		graph.addEdge("Bob49", "Bob53");
		graph.addEdge("Bob48", "Bob50");
		graph.addEdge("Bob48", "Bob51");
		graph.addEdge("Bob51", "Bob53");
		graph.addEdge("Bob50", "Bob54");
		graph.addEdge("Bob49", "Bob51");
		graph.addEdge("Bob49", "Bob52");
		graph.addEdge("Bob52", "Bob54");
		graph.addEdge("Bob51", "Bob55");
		graph.addEdge("Bob50", "Bob52");
		graph.addEdge("Bob50", "Bob53");
		graph.addEdge("Bob53", "Bob55");
		graph.addEdge("Bob52", "Bob56");
		graph.addEdge("Bob51", "Bob53");
		graph.addEdge("Bob51", "Bob54");
		graph.addEdge("Bob54", "Bob56");
		graph.addEdge("Bob53", "Bob57");
		graph.addEdge("Bob52", "Bob54");
		graph.addEdge("Bob52", "Bob55");
		graph.addEdge("Bob55", "Bob57");
		graph.addEdge("Bob54", "Bob58");
		graph.addEdge("Bob53", "Bob55");
		graph.addEdge("Bob53", "Bob56");
		graph.addEdge("Bob56", "Bob58");
		graph.addEdge("Bob55", "Bob59");
		graph.addEdge("Bob54", "Bob56");
		graph.addEdge("Bob54", "Bob57");
		graph.addEdge("Bob57", "Bob59");
		graph.addEdge("Bob56", "Bob60");
		graph.addEdge("Bob55", "Bob57");
		graph.addEdge("Bob55", "Bob58");
		graph.addEdge("Bob58", "Bob60");
		graph.addEdge("Bob57", "Bob61");
		graph.addEdge("Bob56", "Bob58");
		graph.addEdge("Bob56", "Bob59");
		graph.addEdge("Bob59", "Bob61");
		graph.addEdge("Bob58", "Bob62");
		graph.addEdge("Bob57", "Bob59");
		graph.addEdge("Bob57", "Bob60");
		graph.addEdge("Bob60", "Bob62");
		graph.addEdge("Bob59", "Bob63");
		graph.addEdge("Bob58", "Bob60");
		graph.addEdge("Bob58", "Bob61");
		graph.addEdge("Bob61", "Bob63");
		graph.addEdge("Bob60", "Bob64");
		graph.addEdge("Bob59", "Bob61");
		graph.addEdge("Bob59", "Bob62");
		graph.addEdge("Bob62", "Bob64");
		graph.addEdge("Bob61", "Bob65");
		graph.addEdge("Bob60", "Bob62");
		graph.addEdge("Bob60", "Bob63");
		graph.addEdge("Bob63", "Bob65");
		graph.addEdge("Bob62", "Bob66");
		graph.addEdge("Bob61", "Bob63");
		graph.addEdge("Bob61", "Bob64");
		graph.addEdge("Bob64", "Bob66");
		graph.addEdge("Bob63", "Bob67");
		graph.addEdge("Bob62", "Bob64");
		graph.addEdge("Bob62", "Bob65");
		graph.addEdge("Bob65", "Bob67");
		graph.addEdge("Bob64", "Bob68");
		graph.addEdge("Bob63", "Bob65");
		graph.addEdge("Bob63", "Bob66");
		graph.addEdge("Bob66", "Bob68");
		graph.addEdge("Bob65", "Bob69");
		graph.addEdge("Bob64", "Bob66");
		graph.addEdge("Bob64", "Bob67");
		graph.addEdge("Bob67", "Bob69");
		graph.addEdge("Bob66", "Bob70");
		graph.addEdge("Bob65", "Bob67");
		graph.addEdge("Bob65", "Bob68");
		graph.addEdge("Bob68", "Bob70");
		graph.addEdge("Bob67", "Bob71");
		graph.addEdge("Bob66", "Bob68");
		graph.addEdge("Bob66", "Bob69");
		graph.addEdge("Bob69", "Bob71");
		graph.addEdge("Bob68", "Bob72");
		graph.addEdge("Bob67", "Bob69");
		graph.addEdge("Bob67", "Bob70");
		graph.addEdge("Bob70", "Bob72");
		graph.addEdge("Bob69", "Bob73");
		graph.addEdge("Bob68", "Bob70");
		graph.addEdge("Bob68", "Bob71");
		graph.addEdge("Bob71", "Bob73");
		graph.addEdge("Bob70", "Bob74");
		graph.addEdge("Bob69", "Bob71");
		graph.addEdge("Bob69", "Bob72");
		graph.addEdge("Bob72", "Bob74");
		graph.addEdge("Bob71", "Bob75");
		graph.addEdge("Bob70", "Bob72");
		graph.addEdge("Bob70", "Bob73");
		graph.addEdge("Bob73", "Bob75");
		graph.addEdge("Bob72", "Bob76");
		graph.addEdge("Bob71", "Bob73");
		graph.addEdge("Bob71", "Bob74");
		graph.addEdge("Bob74", "Bob76");
		graph.addEdge("Bob73", "Bob77");
		graph.addEdge("Bob72", "Bob74");
		graph.addEdge("Bob72", "Bob75");
		graph.addEdge("Bob75", "Bob77");
		graph.addEdge("Bob74", "Bob78");
		graph.addEdge("Bob73", "Bob75");
		graph.addEdge("Bob73", "Bob76");
		graph.addEdge("Bob76", "Bob78");
		graph.addEdge("Bob75", "Bob79");
		graph.addEdge("Bob74", "Bob76");
		graph.addEdge("Bob74", "Bob77");
		graph.addEdge("Bob77", "Bob79");
		graph.addEdge("Bob76", "Bob80");
		graph.addEdge("Bob75", "Bob77");
		graph.addEdge("Bob75", "Bob78");
		graph.addEdge("Bob78", "Bob80");
		graph.addEdge("Bob77", "Bob81");
		graph.addEdge("Bob76", "Bob78");
		graph.addEdge("Bob76", "Bob79");
		graph.addEdge("Bob79", "Bob81");
		graph.addEdge("Bob78", "Bob82");
		graph.addEdge("Bob77", "Bob79");
		graph.addEdge("Bob77", "Bob80");
		graph.addEdge("Bob80", "Bob82");
		graph.addEdge("Bob79", "Bob83");
		graph.addEdge("Bob78", "Bob80");
		graph.addEdge("Bob78", "Bob81");
		graph.addEdge("Bob81", "Bob83");
		graph.addEdge("Bob80", "Bob84");
		graph.addEdge("Bob79", "Bob81");
		graph.addEdge("Bob79", "Bob82");
		graph.addEdge("Bob82", "Bob84");
		graph.addEdge("Bob81", "Bob85");
		graph.addEdge("Bob80", "Bob82");
		graph.addEdge("Bob80", "Bob83");
		graph.addEdge("Bob83", "Bob85");
		graph.addEdge("Bob82", "Bob86");
		graph.addEdge("Bob81", "Bob83");
		graph.addEdge("Bob81", "Bob84");
		graph.addEdge("Bob84", "Bob86");
		graph.addEdge("Bob83", "Bob87");
		graph.addEdge("Bob82", "Bob84");
		graph.addEdge("Bob82", "Bob85");
		graph.addEdge("Bob85", "Bob87");
		graph.addEdge("Bob84", "Bob88");
		graph.addEdge("Bob83", "Bob85");
		graph.addEdge("Bob83", "Bob86");
		graph.addEdge("Bob86", "Bob88");
		graph.addEdge("Bob85", "Bob89");
		graph.addEdge("Bob84", "Bob86");
		graph.addEdge("Bob84", "Bob87");
		graph.addEdge("Bob87", "Bob89");
		graph.addEdge("Bob86", "Bob90");
		graph.addEdge("Bob85", "Bob87");
		graph.addEdge("Bob85", "Bob88");
		graph.addEdge("Bob88", "Bob90");
		graph.addEdge("Bob87", "Bob91");
		graph.addEdge("Bob86", "Bob88");
		graph.addEdge("Bob86", "Bob89");
		graph.addEdge("Bob89", "Bob91");
		graph.addEdge("Bob88", "Bob92");
		graph.addEdge("Bob87", "Bob89");
		graph.addEdge("Bob87", "Bob90");
		graph.addEdge("Bob90", "Bob92");
		graph.addEdge("Bob89", "Bob93");
		graph.addEdge("Bob88", "Bob90");
		graph.addEdge("Bob88", "Bob91");
		graph.addEdge("Bob91", "Bob93");
		graph.addEdge("Bob90", "Bob94");
		graph.addEdge("Bob89", "Bob91");
		graph.addEdge("Bob89", "Bob92");
		graph.addEdge("Bob92", "Bob94");
		graph.addEdge("Bob91", "Bob95");
		graph.addEdge("Bob90", "Bob92");
		graph.addEdge("Bob90", "Bob93");
		graph.addEdge("Bob93", "Bob95");
		graph.addEdge("Bob92", "Bob96");
		graph.addEdge("Bob91", "Bob93");
		graph.addEdge("Bob91", "Bob94");
		graph.addEdge("Bob94", "Bob96");
		graph.addEdge("Bob93", "Bob97");
		graph.addEdge("Bob92", "Bob94");
		graph.addEdge("Bob92", "Bob95");
		graph.addEdge("Bob95", "Bob97");
		graph.addEdge("Bob94", "Bob98");
		graph.addEdge("Bob93", "Bob95");
		graph.addEdge("Bob93", "Bob96");
		graph.addEdge("Bob96", "Bob98");
		graph.addEdge("Bob95", "Bob99");
		graph.addEdge("Bob94", "Bob96");
		graph.addEdge("Bob94", "Bob97");
		graph.addEdge("Bob97", "Bob99");
		graph.addEdge("Bob96", "Bob100");
		graph.addEdge("Bob95", "Bob97");
		graph.addEdge("Bob95", "Bob98");
		graph.addEdge("Bob98", "Bob100");
		graph.addEdge("Bob97", "Bob101");
		graph.addEdge("Bob96", "Bob98");
		graph.addEdge("Bob96", "Bob99");
		graph.addEdge("Bob99", "Bob101");
		graph.addEdge("Bob98", "Bob102");
		graph.addEdge("Bob97", "Bob99");
		graph.addEdge("Bob97", "Bob100");
		graph.addEdge("Bob100", "Bob102");
		graph.addEdge("Bob99", "Bob103");
		graph.addEdge("Bob98", "Bob100");
		graph.addEdge("Bob98", "Bob101");
		graph.addEdge("Bob101", "Bob103");
		graph.addEdge("Bob100", "Bob104");
		graph.addEdge("Bob99", "Bob101");
		graph.addEdge("Bob99", "Bob102");
		graph.addEdge("Bob102", "Bob104");
		graph.addEdge("Bob101", "Bob105");
		graph.addEdge("Bob100", "Bob102");
		graph.addEdge("Bob100", "Bob103");
		graph.addEdge("Bob103", "Bob105");
		graph.addEdge("Bob102", "Bob106");
		graph.addEdge("Bob101", "Bob103");
		graph.addEdge("Bob101", "Bob104");
		graph.addEdge("Bob104", "Bob106");
		graph.addEdge("Bob103", "Bob107");
		graph.addEdge("Bob102", "Bob104");
		graph.addEdge("Bob102", "Bob105");
		graph.addEdge("Bob105", "Bob107");
		graph.addEdge("Bob104", "Bob108");
		graph.addEdge("Bob103", "Bob105");
		graph.addEdge("Bob103", "Bob106");
		graph.addEdge("Bob106", "Bob108");
		graph.addEdge("Bob105", "Bob109");
		graph.addEdge("Bob104", "Bob106");
		graph.addEdge("Bob104", "Bob107");
		graph.addEdge("Bob107", "Bob109");
		graph.addEdge("Bob106", "Bob110");
		graph.addEdge("Bob105", "Bob107");
		graph.addEdge("Bob105", "Bob108");
		graph.addEdge("Bob108", "Bob110");
		graph.addEdge("Bob107", "Bob111");
		graph.addEdge("Bob106", "Bob108");
		graph.addEdge("Bob106", "Bob109");
		graph.addEdge("Bob109", "Bob111");
		graph.addEdge("Bob108", "Bob112");
		graph.addEdge("Bob107", "Bob109");
		graph.addEdge("Bob107", "Bob110");
		graph.addEdge("Bob110", "Bob112");
		graph.addEdge("Bob109", "Bob113");
		graph.addEdge("Bob108", "Bob110");
		graph.addEdge("Bob108", "Bob111");
		graph.addEdge("Bob111", "Bob113");
		graph.addEdge("Bob110", "Bob114");
		graph.addEdge("Bob109", "Bob111");
		graph.addEdge("Bob109", "Bob112");
		graph.addEdge("Bob112", "Bob114");
		graph.addEdge("Bob111", "Bob115");
		graph.addEdge("Bob110", "Bob112");
		graph.addEdge("Bob110", "Bob113");
		graph.addEdge("Bob113", "Bob115");
		graph.addEdge("Bob112", "Bob116");
		graph.addEdge("Bob111", "Bob113");
		graph.addEdge("Bob111", "Bob114");
		graph.addEdge("Bob114", "Bob116");
		graph.addEdge("Bob113", "Bob117");
		graph.addEdge("Bob112", "Bob114");
		graph.addEdge("Bob112", "Bob115");
		graph.addEdge("Bob115", "Bob117");
		graph.addEdge("Bob114", "Bob118");
		graph.addEdge("Bob113", "Bob115");
		graph.addEdge("Bob113", "Bob116");
		graph.addEdge("Bob116", "Bob118");
		graph.addEdge("Bob115", "Bob119");
		graph.addEdge("Bob114", "Bob116");
		graph.addEdge("Bob114", "Bob117");
		graph.addEdge("Bob117", "Bob119");
		graph.addEdge("Bob116", "Bob120");
		graph.addEdge("Bob115", "Bob117");
		graph.addEdge("Bob115", "Bob118");
		graph.addEdge("Bob118", "Bob120");
		graph.addEdge("Bob117", "Bob121");
		graph.addEdge("Bob116", "Bob118");
		graph.addEdge("Bob116", "Bob119");
		graph.addEdge("Bob119", "Bob121");
		graph.addEdge("Bob118", "Bob122");
		graph.addEdge("Bob117", "Bob119");
		graph.addEdge("Bob117", "Bob120");
		graph.addEdge("Bob120", "Bob122");
		graph.addEdge("Bob119", "Bob123");
		graph.addEdge("Bob118", "Bob120");
		graph.addEdge("Bob118", "Bob121");
		graph.addEdge("Bob121", "Bob123");
		graph.addEdge("Bob120", "Bob124");
		graph.addEdge("Bob119", "Bob121");
		graph.addEdge("Bob119", "Bob122");
		graph.addEdge("Bob122", "Bob124");
		graph.addEdge("Bob121", "Bob125");
		graph.addEdge("Bob120", "Bob122");
		graph.addEdge("Bob120", "Bob123");
		graph.addEdge("Bob123", "Bob125");
		graph.addEdge("Bob122", "Bob126");
		graph.addEdge("Bob121", "Bob123");
		graph.addEdge("Bob121", "Bob124");
		graph.addEdge("Bob124", "Bob126");
		graph.addEdge("Bob123", "Bob127");
		graph.addEdge("Bob122", "Bob124");
		graph.addEdge("Bob122", "Bob125");
		graph.addEdge("Bob125", "Bob127");
		graph.addEdge("Bob124", "Bob128");
		graph.addEdge("Bob123", "Bob125");
		graph.addEdge("Bob123", "Bob126");
		graph.addEdge("Bob126", "Bob128");
		graph.addEdge("Bob125", "Bob129");
		graph.addEdge("Bob124", "Bob126");
		graph.addEdge("Bob124", "Bob127");
		graph.addEdge("Bob127", "Bob129");
		graph.addEdge("Bob126", "Bob130");
		graph.addEdge("Bob125", "Bob127");
		graph.addEdge("Bob125", "Bob128");
		graph.addEdge("Bob128", "Bob130");
		graph.addEdge("Bob127", "Bob131");
		graph.addEdge("Bob126", "Bob128");
		graph.addEdge("Bob126", "Bob129");
		graph.addEdge("Bob129", "Bob131");
		graph.addEdge("Bob128", "Bob132");
		graph.addEdge("Bob127", "Bob129");
		graph.addEdge("Bob127", "Bob130");
		graph.addEdge("Bob130", "Bob132");
		graph.addEdge("Bob129", "Bob133");
		graph.addEdge("Bob128", "Bob130");
		graph.addEdge("Bob128", "Bob131");
		graph.addEdge("Bob131", "Bob133");
		graph.addEdge("Bob130", "Bob134");
		graph.addEdge("Bob129", "Bob131");
		graph.addEdge("Bob129", "Bob132");
		graph.addEdge("Bob132", "Bob134");
		graph.addEdge("Bob131", "Bob135");
		graph.addEdge("Bob130", "Bob132");
		graph.addEdge("Bob130", "Bob133");
		graph.addEdge("Bob133", "Bob135");
		graph.addEdge("Bob132", "Bob136");
		graph.addEdge("Bob131", "Bob133");
		graph.addEdge("Bob131", "Bob134");
		graph.addEdge("Bob134", "Bob136");
		graph.addEdge("Bob133", "Bob137");
		graph.addEdge("Bob132", "Bob134");
		graph.addEdge("Bob132", "Bob135");
		graph.addEdge("Bob135", "Bob137");
		graph.addEdge("Bob134", "Bob138");
		graph.addEdge("Bob133", "Bob135");
		graph.addEdge("Bob133", "Bob136");
		graph.addEdge("Bob136", "Bob138");
		graph.addEdge("Bob135", "Bob139");
		graph.addEdge("Bob134", "Bob136");
		graph.addEdge("Bob134", "Bob137");
		graph.addEdge("Bob137", "Bob139");
		graph.addEdge("Bob136", "Bob140");
		graph.addEdge("Bob135", "Bob137");
		graph.addEdge("Bob135", "Bob138");
		graph.addEdge("Bob138", "Bob140");
		graph.addEdge("Bob137", "Bob141");
		graph.addEdge("Bob136", "Bob138");
		graph.addEdge("Bob136", "Bob139");
		graph.addEdge("Bob139", "Bob141");
		graph.addEdge("Bob138", "Bob142");
		graph.addEdge("Bob137", "Bob139");
		graph.addEdge("Bob137", "Bob140");
		graph.addEdge("Bob140", "Bob142");
		graph.addEdge("Bob139", "Bob143");
		graph.addEdge("Bob138", "Bob140");
		graph.addEdge("Bob138", "Bob141");
		graph.addEdge("Bob141", "Bob143");
		graph.addEdge("Bob140", "Bob144");
		graph.addEdge("Bob139", "Bob141");
		graph.addEdge("Bob139", "Bob142");
		graph.addEdge("Bob142", "Bob144");
		graph.addEdge("Bob141", "Bob145");
		graph.addEdge("Bob140", "Bob142");
		graph.addEdge("Bob140", "Bob143");
		graph.addEdge("Bob143", "Bob145");
		graph.addEdge("Bob142", "Bob146");
		graph.addEdge("Bob141", "Bob143");
		graph.addEdge("Bob141", "Bob144");
		graph.addEdge("Bob144", "Bob146");
		graph.addEdge("Bob143", "Bob147");
		graph.addEdge("Bob142", "Bob144");
		graph.addEdge("Bob142", "Bob145");
		graph.addEdge("Bob145", "Bob147");
		graph.addEdge("Bob144", "Bob148");
		graph.addEdge("Bob143", "Bob145");
		graph.addEdge("Bob143", "Bob146");
		graph.addEdge("Bob146", "Bob148");
		graph.addEdge("Bob145", "Bob149");
		graph.addEdge("Bob144", "Bob146");
		graph.addEdge("Bob144", "Bob147");
		graph.addEdge("Bob147", "Bob149");
		graph.addEdge("Bob146", "Bob150");
		graph.addEdge("Bob145", "Bob147");
		graph.addEdge("Bob145", "Bob148");
		graph.addEdge("Bob148", "Bob150");
		graph.addEdge("Bob147", "Bob151");
		graph.addEdge("Bob146", "Bob148");
		graph.addEdge("Bob146", "Bob149");
		graph.addEdge("Bob149", "Bob151");
		graph.addEdge("Bob148", "Bob152");
		graph.addEdge("Bob147", "Bob149");
		graph.addEdge("Bob147", "Bob150");
		graph.addEdge("Bob150", "Bob152");
		graph.addEdge("Bob149", "Bob153");
		graph.addEdge("Bob148", "Bob150");
		graph.addEdge("Bob148", "Bob151");
		graph.addEdge("Bob151", "Bob153");
		graph.addEdge("Bob150", "Bob154");
		graph.addEdge("Bob149", "Bob151");
		graph.addEdge("Bob149", "Bob152");
		graph.addEdge("Bob152", "Bob154");
		graph.addEdge("Bob151", "Bob155");
		graph.addEdge("Bob150", "Bob152");
		graph.addEdge("Bob150", "Bob153");
		graph.addEdge("Bob153", "Bob155");
		graph.addEdge("Bob152", "Bob156");
		graph.addEdge("Bob151", "Bob153");
		graph.addEdge("Bob151", "Bob154");
		graph.addEdge("Bob154", "Bob156");
		graph.addEdge("Bob153", "Bob157");
		graph.addEdge("Bob152", "Bob154");
		graph.addEdge("Bob152", "Bob155");
		graph.addEdge("Bob155", "Bob157");
		graph.addEdge("Bob154", "Bob158");
		graph.addEdge("Bob153", "Bob155");
		graph.addEdge("Bob153", "Bob156");
		graph.addEdge("Bob156", "Bob158");
		graph.addEdge("Bob155", "Bob159");
		graph.addEdge("Bob154", "Bob156");
		graph.addEdge("Bob154", "Bob157");
		graph.addEdge("Bob157", "Bob159");
		graph.addEdge("Bob156", "Bob160");
		graph.addEdge("Bob155", "Bob157");
		graph.addEdge("Bob155", "Bob158");
		graph.addEdge("Bob158", "Bob160");
		graph.addEdge("Bob157", "Bob161");
		graph.addEdge("Bob156", "Bob158");
		graph.addEdge("Bob156", "Bob159");
		graph.addEdge("Bob159", "Bob161");
		graph.addEdge("Bob158", "Bob162");
		graph.addEdge("Bob157", "Bob159");
		graph.addEdge("Bob157", "Bob160");
		graph.addEdge("Bob160", "Bob162");
		graph.addEdge("Bob159", "Bob163");
		graph.addEdge("Bob158", "Bob160");
		graph.addEdge("Bob158", "Bob161");
		graph.addEdge("Bob161", "Bob163");
		graph.addEdge("Bob160", "Bob164");
		graph.addEdge("Bob159", "Bob161");
		graph.addEdge("Bob159", "Bob162");
		graph.addEdge("Bob162", "Bob164");
		graph.addEdge("Bob161", "Bob165");
		graph.addEdge("Bob160", "Bob162");
		graph.addEdge("Bob160", "Bob163");
		graph.addEdge("Bob163", "Bob165");
		graph.addEdge("Bob162", "Bob166");
		graph.addEdge("Bob161", "Bob163");
		graph.addEdge("Bob161", "Bob164");
		graph.addEdge("Bob164", "Bob166");
		graph.addEdge("Bob163", "Bob167");
		graph.addEdge("Bob162", "Bob164");
		graph.addEdge("Bob162", "Bob165");
		graph.addEdge("Bob165", "Bob167");
		graph.addEdge("Bob164", "Bob168");
		graph.addEdge("Bob163", "Bob165");
		graph.addEdge("Bob163", "Bob166");
		graph.addEdge("Bob166", "Bob168");
		graph.addEdge("Bob165", "Bob169");
		graph.addEdge("Bob164", "Bob166");
		graph.addEdge("Bob164", "Bob167");
		graph.addEdge("Bob167", "Bob169");
		graph.addEdge("Bob166", "Bob170");
		graph.addEdge("Bob165", "Bob167");
		graph.addEdge("Bob165", "Bob168");
		graph.addEdge("Bob168", "Bob170");
		graph.addEdge("Bob167", "Bob171");
		graph.addEdge("Bob166", "Bob168");
		graph.addEdge("Bob166", "Bob169");
		graph.addEdge("Bob169", "Bob171");
		graph.addEdge("Bob168", "Bob172");
		graph.addEdge("Bob167", "Bob169");
		graph.addEdge("Bob167", "Bob170");
		graph.addEdge("Bob170", "Bob172");
		graph.addEdge("Bob169", "Bob173");
		graph.addEdge("Bob168", "Bob170");
		graph.addEdge("Bob168", "Bob171");
		graph.addEdge("Bob171", "Bob173");
		graph.addEdge("Bob170", "Bob174");
		graph.addEdge("Bob169", "Bob171");
		graph.addEdge("Bob169", "Bob172");
		graph.addEdge("Bob172", "Bob174");
		graph.addEdge("Bob171", "Bob175");
		graph.addEdge("Bob170", "Bob172");
		graph.addEdge("Bob170", "Bob173");
		graph.addEdge("Bob173", "Bob175");
		graph.addEdge("Bob172", "Bob176");
		graph.addEdge("Bob171", "Bob173");
		graph.addEdge("Bob171", "Bob174");
		graph.addEdge("Bob174", "Bob176");
		graph.addEdge("Bob173", "Bob177");
		graph.addEdge("Bob172", "Bob174");
		graph.addEdge("Bob172", "Bob175");
		graph.addEdge("Bob175", "Bob177");
		graph.addEdge("Bob174", "Bob178");
		graph.addEdge("Bob173", "Bob175");
		graph.addEdge("Bob173", "Bob176");
		graph.addEdge("Bob176", "Bob178");
		graph.addEdge("Bob175", "Bob179");
		graph.addEdge("Bob174", "Bob176");
		graph.addEdge("Bob174", "Bob177");
		graph.addEdge("Bob177", "Bob179");
		graph.addEdge("Bob176", "Bob180");
		graph.addEdge("Bob175", "Bob177");
		graph.addEdge("Bob175", "Bob178");
		graph.addEdge("Bob178", "Bob180");
		graph.addEdge("Bob177", "Bob181");
		graph.addEdge("Bob176", "Bob178");
		graph.addEdge("Bob176", "Bob179");
		graph.addEdge("Bob179", "Bob181");
		graph.addEdge("Bob178", "Bob182");
		graph.addEdge("Bob177", "Bob179");
		graph.addEdge("Bob177", "Bob180");
		graph.addEdge("Bob180", "Bob182");
		graph.addEdge("Bob179", "Bob183");
		graph.addEdge("Bob178", "Bob180");
		graph.addEdge("Bob178", "Bob181");
		graph.addEdge("Bob181", "Bob183");
		graph.addEdge("Bob180", "Bob184");
		graph.addEdge("Bob179", "Bob181");
		graph.addEdge("Bob179", "Bob182");
		graph.addEdge("Bob182", "Bob184");
		graph.addEdge("Bob181", "Bob185");
		return graph;
	}

	public List<List<Vertex>> getEdges() {
		Collection<List<Vertex>> values = this.adjVertices.values();
		return new ArrayList<List<Vertex>>(values);
	}
	
	public int getVertexIndex(Vertex vertex) {
		return new ArrayList<>(this.adjVertices.keySet()).indexOf(vertex);
	}

	@Override
	public String toString() {
		return "Graph [adjVertices=" + adjVertices + "]";
	}

}

class Vertex {
	String label;

	Vertex(String label) {
		this.label = label;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}

}
