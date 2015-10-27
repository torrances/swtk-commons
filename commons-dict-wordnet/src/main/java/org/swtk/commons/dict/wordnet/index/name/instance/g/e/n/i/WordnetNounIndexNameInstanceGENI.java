package org.swtk.commons.dict.wordnet.index.name.instance.g.e.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGENI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"geniality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04662009\"]}");
	add("{\"term\":\"genie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09567562\"]}");
	add("{\"term\":\"genip\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07779266\", \"12765610\"]}");
	add("{\"term\":\"genipa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12688167\"]}");
	add("{\"term\":\"genipap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07779459\"]}");
	add("{\"term\":\"genista\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12550713\"]}");
	add("{\"term\":\"genitalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05521732\"]}");
	add("{\"term\":\"genitals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05521732\"]}");
	add("{\"term\":\"genitive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06322842\"]}");
	add("{\"term\":\"genitor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10146245\"]}");
	add("{\"term\":\"genius\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05632244\", \"05633156\", \"09781932\", \"05627526\", \"10146463\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }