package org.swtk.commons.dict.wordnet.index.name.instance.r.e.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRECT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rectangle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13906003\"]}");
	add("{\"term\":\"rectangularity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05079038\"]}");
	add("{\"term\":\"rectification\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00156939\", \"00259697\", \"07430908\", \"13568402\"]}");
	add("{\"term\":\"rectifier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10532575\", \"04072744\"]}");
	add("{\"term\":\"rectitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04833854\"]}");
	add("{\"term\":\"recto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06268061\"]}");
	add("{\"term\":\"rectocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14320652\"]}");
	add("{\"term\":\"rectoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00692186\"]}");
	add("{\"term\":\"rector\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10003102\"]}");
	add("{\"term\":\"rectorate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00599983\"]}");
	add("{\"term\":\"rectorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00599983\"]}");
	add("{\"term\":\"rectory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03898254\"]}");
	add("{\"term\":\"rectum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05545439\"]}");
	add("{\"term\":\"rectus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05324140\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }