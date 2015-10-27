package org.swtk.commons.dict.wordnet.index.name.instance.t.i.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTICK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tick\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04439442\", \"06831605\", \"01778954\", \"07412361\"]}");
	add("{\"term\":\"ticker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04439527\", \"04563183\", \"05396148\"]}");
	add("{\"term\":\"ticket\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04723979\", \"06507939\", \"06570669\", \"07287841\", \"06530710\"]}");
	add("{\"term\":\"ticking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04439796\", \"07412361\"]}");
	add("{\"term\":\"tickle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00145265\", \"05731362\"]}");
	add("{\"term\":\"tickler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06805675\"]}");
	add("{\"term\":\"tickling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00145265\"]}");
	add("{\"term\":\"tickseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11977319\"]}");
	add("{\"term\":\"ticktack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06805807\"]}");
	add("{\"term\":\"ticktacktoe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00507218\"]}");
	add("{\"term\":\"ticktacktoo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00507218\"]}");
	add("{\"term\":\"ticktock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07412555\"]}");
	add("{\"term\":\"tickweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11977319\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }