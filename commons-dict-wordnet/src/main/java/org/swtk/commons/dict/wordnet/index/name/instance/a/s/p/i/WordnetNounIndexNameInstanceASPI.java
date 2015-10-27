package org.swtk.commons.dict.wordnet.index.name.instance.a.s.p.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASPI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aspic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07824651\"]}");
	add("{\"term\":\"aspidelaps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01749459\"]}");
	add("{\"term\":\"aspidiotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02252325\"]}");
	add("{\"term\":\"aspidistra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12463828\"]}");
	add("{\"term\":\"aspidophoroides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02650804\"]}");
	add("{\"term\":\"aspinwall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08757502\"]}");
	add("{\"term\":\"aspirant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09820956\"]}");
	add("{\"term\":\"aspirate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07131466\"]}");
	add("{\"term\":\"aspiration\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00838449\", \"07131577\", \"07499687\", \"04843722\"]}");
	add("{\"term\":\"aspirator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02751496\"]}");
	add("{\"term\":\"aspirer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09820956\"]}");
	add("{\"term\":\"aspirin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02751623\"]}");
	add("{\"term\":\"aspis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01755995\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }