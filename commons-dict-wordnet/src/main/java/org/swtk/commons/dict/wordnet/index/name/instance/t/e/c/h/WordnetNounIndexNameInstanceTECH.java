package org.swtk.commons.dict.wordnet.index.name.instance.t.e.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTECH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tech\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08302167\"]}");
	add("{\"term\":\"techie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10715413\"]}");
	add("{\"term\":\"technetium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14681226\"]}");
	add("{\"term\":\"technical\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00772845\", \"04406404\"]}");
	add("{\"term\":\"technicality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05828731\", \"14604142\"]}");
	add("{\"term\":\"technician\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10716004\", \"10715747\"]}");
	add("{\"term\":\"technicolor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05674930\"]}");
	add("{\"term\":\"technique\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05651035\", \"05672990\"]}");
	add("{\"term\":\"techno\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07072104\"]}");
	add("{\"term\":\"technobabble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07102511\"]}");
	add("{\"term\":\"technocracy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08380033\"]}");
	add("{\"term\":\"technocrat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10716168\", \"10716251\"]}");
	add("{\"term\":\"technologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09638837\"]}");
	add("{\"term\":\"technology\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03707142\", \"06134474\", \"00951435\"]}");
	add("{\"term\":\"technophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10716384\"]}");
	add("{\"term\":\"technophilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07571340\"]}");
	add("{\"term\":\"technophobe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10716509\"]}");
	add("{\"term\":\"technophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07519497\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }