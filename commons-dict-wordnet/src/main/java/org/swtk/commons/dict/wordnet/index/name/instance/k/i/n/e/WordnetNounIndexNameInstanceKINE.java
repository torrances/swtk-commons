package org.swtk.commons.dict.wordnet.index.name.instance.k.i.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKINE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02405077\"]}");
	add("{\"term\":\"kinematics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06123384\"]}");
	add("{\"term\":\"kinescope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03622803\"]}");
	add("{\"term\":\"kinesiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092047\"]}");
	add("{\"term\":\"kinesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00864900\"]}");
	add("{\"term\":\"kinesthesia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05666830\", \"05730155\"]}");
	add("{\"term\":\"kinesthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05666830\"]}");
	add("{\"term\":\"kinesthetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05666830\"]}");
	add("{\"term\":\"kinetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06123204\"]}");
	add("{\"term\":\"kinetochore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05451900\"]}");
	add("{\"term\":\"kinetoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03623043\"]}");
	add("{\"term\":\"kinetosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14226828\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }