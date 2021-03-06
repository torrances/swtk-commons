package org.swtk.commons.dict.wordnet.indexbyname.instance.k.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kon tiki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02786923\"]}");
	add("{\"term\":\"konakri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08967390\"]}");
	add("{\"term\":\"kong the master\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10926574\"]}");
	add("{\"term\":\"kongfuze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10926574\"]}");
	add("{\"term\":\"kongo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07006379\"]}");
	add("{\"term\":\"konini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12364468\"]}");
	add("{\"term\":\"konoe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11128757\"]}");
	add("{\"term\":\"konoye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11128757\"]}");
	add("{\"term\":\"konqueror\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06583815\"]}");
	add("{\"term\":\"konrad adenauer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10828360\"]}");
	add("{\"term\":\"konrad lorenz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11158439\"]}");
	add("{\"term\":\"konrad von gesner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11017401\"]}");
	add("{\"term\":\"konrad zacharias lorenz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11158439\"]}");
	add("{\"term\":\"konstantin sergeevich alekseev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11332704\"]}");
	add("{\"term\":\"konstantin sergeyevich stanislavsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11332704\"]}");
	add("{\"term\":\"konstantin stanislavsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11332704\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }