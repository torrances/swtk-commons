package org.swtk.commons.dict.wordnet.index.name.instance.c.r.y.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRYO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cryoanaesthesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14050351\"]}");
	add("{\"term\":\"cryoanesthesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14050351\"]}");
	add("{\"term\":\"cryobiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06079546\"]}");
	add("{\"term\":\"cryocautery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00698867\", \"03146642\"]}");
	add("{\"term\":\"cryogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14850498\"]}");
	add("{\"term\":\"cryogenics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06108294\"]}");
	add("{\"term\":\"cryogeny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06108294\"]}");
	add("{\"term\":\"cryolite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14697311\"]}");
	add("{\"term\":\"cryometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03146750\"]}");
	add("{\"term\":\"cryonics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06079729\"]}");
	add("{\"term\":\"cryopathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14318180\"]}");
	add("{\"term\":\"cryophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14406767\"]}");
	add("{\"term\":\"cryoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03146856\"]}");
	add("{\"term\":\"cryostat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03146976\"]}");
	add("{\"term\":\"cryosurgery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00670072\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }