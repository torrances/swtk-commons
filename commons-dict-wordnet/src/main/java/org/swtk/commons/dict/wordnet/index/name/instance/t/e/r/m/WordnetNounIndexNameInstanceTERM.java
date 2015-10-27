package org.swtk.commons.dict.wordnet.index.name.instance.t.e.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTERM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"term\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"04420858\", \"15251247\", \"06764688\", \"05864488\", \"06783666\", \"15249282\", \"06314878\"]}");
	add("{\"term\":\"termagant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10613555\"]}");
	add("{\"term\":\"termer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10721816\"]}");
	add("{\"term\":\"termes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02225803\"]}");
	add("{\"term\":\"terminal\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04420554\", \"08583557\", \"04420286\", \"04420036\"]}");
	add("{\"term\":\"termination\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00210792\", \"06319755\", \"07307418\", \"08584083\", \"15293639\"]}");
	add("{\"term\":\"terminator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10094127\"]}");
	add("{\"term\":\"terminology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06315049\"]}");
	add("{\"term\":\"terminus\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04420036\", \"04420766\", \"04420858\", \"05990653\", \"08584083\"]}");
	add("{\"term\":\"termite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02225918\"]}");
	add("{\"term\":\"termitidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02225661\"]}");
	add("{\"term\":\"terms\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13324337\", \"13977154\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }