package org.swtk.commons.dict.wordnet.index.name.instance.j.a.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jamb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03597960\"]}");
	add("{\"term\":\"jambalaya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07885587\"]}");
	add("{\"term\":\"jambeau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03462393\"]}");
	add("{\"term\":\"jamberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12932200\", \"12932433\"]}");
	add("{\"term\":\"jambon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07685636\"]}");
	add("{\"term\":\"jamboree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00519725\"]}");
	add("{\"term\":\"jambos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12353235\"]}");
	add("{\"term\":\"jambosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12352735\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }