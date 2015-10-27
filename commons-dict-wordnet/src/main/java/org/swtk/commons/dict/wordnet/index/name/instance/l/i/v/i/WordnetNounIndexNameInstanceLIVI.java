package org.swtk.commons.dict.wordnet.index.name.instance.l.i.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lividity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04984828\", \"07532531\"]}");
	add("{\"term\":\"lividness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04984828\"]}");
	add("{\"term\":\"living\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13386459\", \"13984978\", \"07962404\", \"05818587\"]}");
	add("{\"term\":\"livingston\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11155600\"]}");
	add("{\"term\":\"livingstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11155787\"]}");
	add("{\"term\":\"livistona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12611956\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }