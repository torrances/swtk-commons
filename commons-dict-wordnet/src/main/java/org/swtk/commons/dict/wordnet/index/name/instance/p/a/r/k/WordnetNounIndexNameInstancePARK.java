package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"park\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03896578\", \"08633213\", \"11242645\", \"02785801\", \"08632949\", \"08632724\"]}");
	add("{\"term\":\"parka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03896748\"]}");
	add("{\"term\":\"parker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11242749\", \"11242904\"]}");
	add("{\"term\":\"parkeriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13192345\"]}");
	add("{\"term\":\"parkersburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09179660\"]}");
	add("{\"term\":\"parkia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11783942\"]}");
	add("{\"term\":\"parking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00169326\", \"13800883\"]}");
	add("{\"term\":\"parkinson\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11243109\", \"11243284\"]}");
	add("{\"term\":\"parkinsonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12517997\"]}");
	add("{\"term\":\"parkinsonism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14117832\"]}");
	add("{\"term\":\"parkland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08632724\"]}");
	add("{\"term\":\"parks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11243386\"]}");
	add("{\"term\":\"parkway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03247416\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }