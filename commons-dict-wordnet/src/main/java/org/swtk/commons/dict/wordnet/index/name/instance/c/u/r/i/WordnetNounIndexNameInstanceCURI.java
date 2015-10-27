package org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCURI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"curia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08102563\"]}");
	add("{\"term\":\"curie\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10937455\", \"10937751\", \"13667078\"]}");
	add("{\"term\":\"curietherapy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00707272\"]}");
	add("{\"term\":\"curing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13512263\"]}");
	add("{\"term\":\"curio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03154617\"]}");
	add("{\"term\":\"curiosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06423396\"]}");
	add("{\"term\":\"curiosity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03154617\", \"05690411\"]}");
	add("{\"term\":\"curiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04806593\", \"05691020\"]}");
	add("{\"term\":\"curitiba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08874497\"]}");
	add("{\"term\":\"curium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14660398\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }