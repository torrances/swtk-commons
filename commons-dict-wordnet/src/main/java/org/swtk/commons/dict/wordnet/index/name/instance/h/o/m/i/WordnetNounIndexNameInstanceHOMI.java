package org.swtk.commons.dict.wordnet.index.name.instance.h.o.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"homicide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00220890\"]}");
	add("{\"term\":\"homiletics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05643609\", \"06193234\"]}");
	add("{\"term\":\"homily\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07259609\"]}");
	add("{\"term\":\"hominid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02474393\"]}");
	add("{\"term\":\"hominidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02474098\"]}");
	add("{\"term\":\"hominoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02473931\"]}");
	add("{\"term\":\"hominoidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02473703\"]}");
	add("{\"term\":\"hominy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07748278\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }