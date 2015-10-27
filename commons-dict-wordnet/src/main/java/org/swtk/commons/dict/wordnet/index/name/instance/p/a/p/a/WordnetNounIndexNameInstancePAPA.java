package org.swtk.commons.dict.wordnet.index.name.instance.p.a.p.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAPA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"papa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10007601\"]}");
	add("{\"term\":\"papacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08070012\"]}");
	add("{\"term\":\"papaia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12393617\"]}");
	add("{\"term\":\"papain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14998392\"]}");
	add("{\"term\":\"paparazzo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10416426\"]}");
	add("{\"term\":\"papaver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11921455\"]}");
	add("{\"term\":\"papaveraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11920527\"]}");
	add("{\"term\":\"papaverales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11884833\"]}");
	add("{\"term\":\"papaverine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03891934\"]}");
	add("{\"term\":\"papaw\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07778090\", \"11716068\"]}");
	add("{\"term\":\"papaya\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07778220\", \"12393617\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }