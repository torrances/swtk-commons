package org.swtk.commons.dict.wordnet.index.name.instance.l.a.t.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLATI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"laticifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13111986\"]}");
	add("{\"term\":\"latimeria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02518191\"]}");
	add("{\"term\":\"latimeridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02518041\"]}");
	add("{\"term\":\"latin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10267577\", \"10267705\", \"06975340\"]}");
	add("{\"term\":\"latinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02562902\"]}");
	add("{\"term\":\"latinesce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06909644\"]}");
	add("{\"term\":\"latinism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06304436\"]}");
	add("{\"term\":\"latinist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10267788\"]}");
	add("{\"term\":\"latino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09739652\"]}");
	add("{\"term\":\"latitude\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05134905\", \"08613276\", \"14018633\", \"08613087\"]}");
	add("{\"term\":\"latitudinarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10267895\"]}");
	add("{\"term\":\"latium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08824587\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }