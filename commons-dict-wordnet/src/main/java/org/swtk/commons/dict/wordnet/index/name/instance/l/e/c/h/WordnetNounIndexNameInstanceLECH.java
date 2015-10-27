package org.swtk.commons.dict.wordnet.index.name.instance.l.e.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLECH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lech\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572408\"]}");
	add("{\"term\":\"lechanorales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13008412\"]}");
	add("{\"term\":\"lechatelierite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14903901\"]}");
	add("{\"term\":\"lecher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572408\"]}");
	add("{\"term\":\"lecherousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07504854\"]}");
	add("{\"term\":\"lechery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00858362\"]}");
	add("{\"term\":\"lechwe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02430222\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }