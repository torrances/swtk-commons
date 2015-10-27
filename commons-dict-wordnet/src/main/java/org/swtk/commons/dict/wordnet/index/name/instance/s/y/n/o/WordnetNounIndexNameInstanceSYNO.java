package org.swtk.commons.dict.wordnet.index.name.instance.s.y.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSYNO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"synod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08339450\"]}");
	add("{\"term\":\"synodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02546043\"]}");
	add("{\"term\":\"synonym\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06314672\"]}");
	add("{\"term\":\"synonymist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10706631\"]}");
	add("{\"term\":\"synonymity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13830373\"]}");
	add("{\"term\":\"synonymousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13830373\"]}");
	add("{\"term\":\"synonymy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13830373\"]}");
	add("{\"term\":\"synopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06480622\"]}");
	add("{\"term\":\"synoptics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06467167\"]}");
	add("{\"term\":\"synovia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05422543\"]}");
	add("{\"term\":\"synovitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14379733\"]}");
	add("{\"term\":\"synovium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05614002\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }