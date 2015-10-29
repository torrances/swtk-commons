package org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRIO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08875258\"]}");
	add("{\"term\":\"rio bravo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09433602\"]}");
	add("{\"term\":\"rio de janeiro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08875258\"]}");
	add("{\"term\":\"rio de la plata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09433436\"]}");
	add("{\"term\":\"rio grande\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09433602\"]}");
	add("{\"term\":\"rio nunez coffee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12684120\"]}");
	add("{\"term\":\"rioja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07913840\"]}");
	add("{\"term\":\"riot\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00512223\", \"06791764\", \"14000490\", \"01172992\"]}");
	add("{\"term\":\"riot act\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06550886\", \"06551067\"]}");
	add("{\"term\":\"riot control\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00813815\"]}");
	add("{\"term\":\"riot control operation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00813815\"]}");
	add("{\"term\":\"riot gun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04100869\"]}");
	add("{\"term\":\"rioter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10551615\"]}");
	add("{\"term\":\"rioting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14000490\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }