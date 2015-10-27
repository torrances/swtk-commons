package org.swtk.commons.dict.wordnet.index.name.instance.c.a.l.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCALV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"calvados\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07919883\"]}");
	add("{\"term\":\"calvaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05548040\"]}");
	add("{\"term\":\"calvary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07320650\", \"08814071\"]}");
	add("{\"term\":\"calvatia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13064909\"]}");
	add("{\"term\":\"calvin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10900150\", \"10900421\"]}");
	add("{\"term\":\"calving\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13463812\"]}");
	add("{\"term\":\"calvinism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06239966\"]}");
	add("{\"term\":\"calvinist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09908798\"]}");
	add("{\"term\":\"calvino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10900593\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }