package org.swtk.commons.dict.wordnet.index.name.instance.l.i.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lipochondrodystrophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14180645\"]}");
	add("{\"term\":\"lipogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07027301\"]}");
	add("{\"term\":\"lipoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14963045\"]}");
	add("{\"term\":\"lipoidaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14217407\"]}");
	add("{\"term\":\"lipoidemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14217407\"]}");
	add("{\"term\":\"lipoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14262804\"]}");
	add("{\"term\":\"lipomatosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14139281\"]}");
	add("{\"term\":\"lipoprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14963368\"]}");
	add("{\"term\":\"liposarcoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14264723\"]}");
	add("{\"term\":\"liposcelis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02263938\"]}");
	add("{\"term\":\"liposome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05527943\"]}");
	add("{\"term\":\"liposuction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00683496\"]}");
	add("{\"term\":\"lipotyphla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01891462\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }