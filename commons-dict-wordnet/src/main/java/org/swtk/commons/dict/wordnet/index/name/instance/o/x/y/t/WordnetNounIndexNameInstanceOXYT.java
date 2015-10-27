package org.swtk.commons.dict.wordnet.index.name.instance.o.x.y.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOXYT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oxytetracycline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03875067\"]}");
	add("{\"term\":\"oxytocic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03875363\"]}");
	add("{\"term\":\"oxytocin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05418914\"]}");
	add("{\"term\":\"oxytone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06305497\"]}");
	add("{\"term\":\"oxytropis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12574747\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }