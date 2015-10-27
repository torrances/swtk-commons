package org.swtk.commons.dict.wordnet.index.name.instance.s.c.h.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCHN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"schnabel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11305446\"]}");
	add("{\"term\":\"schnapps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07921714\"]}");
	add("{\"term\":\"schnaps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07921714\"]}");
	add("{\"term\":\"schnauzer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02099408\"]}");
	add("{\"term\":\"schnecken\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07708968\"]}");
	add("{\"term\":\"schnittlaugh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12455657\"]}");
	add("{\"term\":\"schnitzel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07896433\"]}");
	add("{\"term\":\"schnook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10576945\"]}");
	add("{\"term\":\"schnorchel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04257960\"]}");
	add("{\"term\":\"schnorkel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04257960\"]}");
	add("{\"term\":\"schnorrer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10577127\"]}");
	add("{\"term\":\"schnoz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05606462\"]}");
	add("{\"term\":\"schnozzle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05606462\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }