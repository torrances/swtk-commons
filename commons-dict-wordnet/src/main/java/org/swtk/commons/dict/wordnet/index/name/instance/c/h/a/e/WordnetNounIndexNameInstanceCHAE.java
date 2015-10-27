package org.swtk.commons.dict.wordnet.index.name.instance.c.h.a.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHAE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chaenactis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11970326\"]}");
	add("{\"term\":\"chaenomeles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12645010\"]}");
	add("{\"term\":\"chaenopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02616918\"]}");
	add("{\"term\":\"chaeronea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01277024\"]}");
	add("{\"term\":\"chaeta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01904335\"]}");
	add("{\"term\":\"chaetodipterus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02607441\"]}");
	add("{\"term\":\"chaetodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02608333\"]}");
	add("{\"term\":\"chaetodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02607769\"]}");
	add("{\"term\":\"chaetognath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01926531\"]}");
	add("{\"term\":\"chaetognatha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01926278\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }