package org.swtk.commons.dict.wordnet.index.name.instance.a.r.b.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARBO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arbor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02735832\", \"04284631\", \"13128650\"]}");
	add("{\"term\":\"arboretum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02736080\"]}");
	add("{\"term\":\"arboriculture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00919445\"]}");
	add("{\"term\":\"arboriculturist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10124525\"]}");
	add("{\"term\":\"arborist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10747470\"]}");
	add("{\"term\":\"arborolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01047638\"]}");
	add("{\"term\":\"arborvirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01331827\"]}");
	add("{\"term\":\"arborvitae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11664286\"]}");
	add("{\"term\":\"arbour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02735832\"]}");
	add("{\"term\":\"arbovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01331827\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }