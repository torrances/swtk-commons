package org.swtk.commons.dict.wordnet.index.name.instance.l.o.g.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOGO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"logo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07286789\"]}");
	add("{\"term\":\"logogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06853940\"]}");
	add("{\"term\":\"logograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06853940\"]}");
	add("{\"term\":\"logomach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10289806\"]}");
	add("{\"term\":\"logomachist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10289806\"]}");
	add("{\"term\":\"logomachy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07156027\"]}");
	add("{\"term\":\"logomania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09205298\"]}");
	add("{\"term\":\"logorrhea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09205298\"]}");
	add("{\"term\":\"logos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09560255\"]}");
	add("{\"term\":\"logotype\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07286789\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }