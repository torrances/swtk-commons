package org.swtk.commons.dict.wordnet.index.name.instance.f.a.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFACT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fact\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05898503\", \"13979160\", \"06648784\", \"05825522\"]}");
	add("{\"term\":\"faction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08268798\", \"08258719\"]}");
	add("{\"term\":\"factoid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06496576\", \"06496690\"]}");
	add("{\"term\":\"factor\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"05444328\", \"05866901\", \"13614422\", \"09796453\", \"13755542\", \"05877576\", \"07342405\"]}");
	add("{\"term\":\"factorial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05868395\"]}");
	add("{\"term\":\"factoring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05791038\"]}");
	add("{\"term\":\"factorisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05791038\"]}");
	add("{\"term\":\"factorization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05791038\"]}");
	add("{\"term\":\"factory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03321351\"]}");
	add("{\"term\":\"factotum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10095590\"]}");
	add("{\"term\":\"factuality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04766683\"]}");
	add("{\"term\":\"factualness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04766683\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }