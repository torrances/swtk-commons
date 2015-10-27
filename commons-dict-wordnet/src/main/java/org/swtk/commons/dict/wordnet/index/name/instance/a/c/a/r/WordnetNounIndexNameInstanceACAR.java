package org.swtk.commons.dict.wordnet.index.name.instance.a.c.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceACAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"acaracide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14623014\"]}");
	add("{\"term\":\"acardia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14042767\"]}");
	add("{\"term\":\"acariasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14476532\"]}");
	add("{\"term\":\"acaricide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14623014\"]}");
	add("{\"term\":\"acarid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01782783\"]}");
	add("{\"term\":\"acaridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01782667\"]}");
	add("{\"term\":\"acaridiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14476532\"]}");
	add("{\"term\":\"acarina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01778520\"]}");
	add("{\"term\":\"acarine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01778833\"]}");
	add("{\"term\":\"acariosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14476532\"]}");
	add("{\"term\":\"acarophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14405137\"]}");
	add("{\"term\":\"acarus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01784211\"]}");
	add("{\"term\":\"acaryote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05457114\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }