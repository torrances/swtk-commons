package org.swtk.commons.dict.wordnet.index.name.instance.s.l.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSLIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"slip\", \"synsetCount\":15, \"upperType\":\"NOUN\", \"ids\":[\"00060196\", \"00171531\", \"00329857\", \"02978871\", \"03017234\", \"04247434\", \"04346369\", \"04954805\", \"07332119\", \"08657686\", \"10631620\", \"13148232\", \"14838465\", \"00074648\", \"00077016\"]}");
	add("{\"term\":\"slipcover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04247880\"]}");
	add("{\"term\":\"slipknot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04248170\"]}");
	add("{\"term\":\"slipover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04027422\"]}");
	add("{\"term\":\"slippage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00329711\", \"13577580\", \"13577452\"]}");
	add("{\"term\":\"slipper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10624496\", \"04248522\"]}");
	add("{\"term\":\"slipperiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04882923\", \"04954805\"]}");
	add("{\"term\":\"slipperwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12900287\"]}");
	add("{\"term\":\"slipstick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04245869\"]}");
	add("{\"term\":\"slipstream\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11443311\"]}");
	add("{\"term\":\"slipway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04572325\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }