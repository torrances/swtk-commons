package org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNAB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nabalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12017261\"]}");
	add("{\"term\":\"nabalus alba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12017629\"]}");
	add("{\"term\":\"nabalus serpentarius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12017878\"]}");
	add("{\"term\":\"nablus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08811598\"]}");
	add("{\"term\":\"nabob\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10363735\", \"10368483\"]}");
	add("{\"term\":\"nabokov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11218971\"]}");
	add("{\"term\":\"naboom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12942420\"]}");
	add("{\"term\":\"nabothian cyst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14225754\"]}");
	add("{\"term\":\"nabothian follicle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14225754\"]}");
	add("{\"term\":\"nabothian gland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05562800\"]}");
	add("{\"term\":\"nabu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09542731\"]}");
	add("{\"term\":\"nabumetone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03809588\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }