package org.swtk.commons.dict.wordnet.index.name.instance.m.o.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMORT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mortal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00007846\"]}");
	add("{\"term\":\"mortality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15302104\", \"05063125\"]}");
	add("{\"term\":\"mortar\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03792434\", \"14980028\", \"03792248\"]}");
	add("{\"term\":\"mortarboard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03792565\", \"03792697\"]}");
	add("{\"term\":\"mortgage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13373153\"]}");
	add("{\"term\":\"mortgagee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10351060\"]}");
	add("{\"term\":\"mortgager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10351282\"]}");
	add("{\"term\":\"mortgagor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10351282\"]}");
	add("{\"term\":\"mortice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03792841\"]}");
	add("{\"term\":\"mortician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10351554\"]}");
	add("{\"term\":\"mortification\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01071235\", \"07323841\", \"11507108\", \"07522981\"]}");
	add("{\"term\":\"mortimer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11212891\"]}");
	add("{\"term\":\"mortise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03792841\"]}");
	add("{\"term\":\"mortmain\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05201703\", \"13271143\"]}");
	add("{\"term\":\"morton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11213048\"]}");
	add("{\"term\":\"mortuary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03791032\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }