package org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rod\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03432112\", \"05464032\", \"13635960\", \"13672539\", \"01380243\", \"04107268\"]}");
	add("{\"term\":\"rod cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05464032\"]}");
	add("{\"term\":\"rod laver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11139624\"]}");
	add("{\"term\":\"rodent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02332053\"]}");
	add("{\"term\":\"rodentia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02331745\"]}");
	add("{\"term\":\"rodeo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04107613\", \"00523995\"]}");
	add("{\"term\":\"rodeo rider\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09992602\"]}");
	add("{\"term\":\"rodgers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11287735\"]}");
	add("{\"term\":\"rodhos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08801664\"]}");
	add("{\"term\":\"rodin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11287939\"]}");
	add("{\"term\":\"rodney george laver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11139624\"]}");
	add("{\"term\":\"rodolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02169326\"]}");
	add("{\"term\":\"rodolia cardinalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02169478\"]}");
	add("{\"term\":\"rodomontade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07244749\"]}");
	add("{\"term\":\"rodrigo borgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10832808\"]}");
	add("{\"term\":\"rodya raskolnikov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10527376\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }