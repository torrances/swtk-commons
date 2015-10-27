package org.swtk.commons.dict.wordnet.index.name.instance.c.e.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCELE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"celebes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08928880\"]}");
	add("{\"term\":\"celebrant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09922304\", \"09922407\"]}");
	add("{\"term\":\"celebrater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09922407\"]}");
	add("{\"term\":\"celebration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00517142\", \"00428985\", \"07465251\"]}");
	add("{\"term\":\"celebrator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09922407\"]}");
	add("{\"term\":\"celebrex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02994016\"]}");
	add("{\"term\":\"celebrity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14460852\", \"09922606\"]}");
	add("{\"term\":\"celecoxib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02994016\"]}");
	add("{\"term\":\"celeriac\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07746684\", \"12954376\"]}");
	add("{\"term\":\"celerity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05066283\"]}");
	add("{\"term\":\"celery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07746382\", \"12954163\"]}");
	add("{\"term\":\"celesta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02994213\"]}");
	add("{\"term\":\"celestite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14694222\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }