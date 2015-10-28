package org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pooch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02087384\"]}");
	add("{\"term\":\"pood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13740943\"]}");
	add("{\"term\":\"poodle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02115987\"]}");
	add("{\"term\":\"pooecetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01537646\"]}");
	add("{\"term\":\"poof\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10095821\"]}");
	add("{\"term\":\"pool\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00502091\", \"08682839\", \"13390647\", \"09420482\", \"13391030\", \"08253359\", \"08498380\", \"09420266\", \"03988418\"]}");
	add("{\"term\":\"pooler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10472617\"]}");
	add("{\"term\":\"poolroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03988689\"]}");
	add("{\"term\":\"poon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12385121\", \"12385340\"]}");
	add("{\"term\":\"poop\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04323784\", \"06648638\", \"10378493\", \"14878732\"]}");
	add("{\"term\":\"poor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08196123\"]}");
	add("{\"term\":\"poorhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03989253\"]}");
	add("{\"term\":\"poorness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04738055\", \"05120762\", \"05155646\", \"14516729\"]}");
	add("{\"term\":\"poorwill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01839314\"]}");
	add("{\"term\":\"poove\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10095821\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }