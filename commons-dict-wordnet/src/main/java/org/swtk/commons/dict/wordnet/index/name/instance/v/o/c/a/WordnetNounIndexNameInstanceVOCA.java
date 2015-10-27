package org.swtk.commons.dict.wordnet.index.name.instance.v.o.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVOCA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vocable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06315566\"]}");
	add("{\"term\":\"vocabulary\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05671119\", \"05659087\", \"06432321\"]}");
	add("{\"term\":\"vocal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07062058\", \"07296711\"]}");
	add("{\"term\":\"vocalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07125323\"]}");
	add("{\"term\":\"vocaliser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10619214\", \"10763332\"]}");
	add("{\"term\":\"vocalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07125323\", \"07128611\"]}");
	add("{\"term\":\"vocalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10619214\"]}");
	add("{\"term\":\"vocalization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07124555\", \"07125323\"]}");
	add("{\"term\":\"vocalizer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10619214\", \"10763332\"]}");
	add("{\"term\":\"vocalizing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00546538\"]}");
	add("{\"term\":\"vocation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08420588\", \"00584283\"]}");
	add("{\"term\":\"vocative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06323227\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }