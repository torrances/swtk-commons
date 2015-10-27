package org.swtk.commons.dict.wordnet.index.name.instance.f.l.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flambeau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03361292\"]}");
	add("{\"term\":\"flamboyance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04707284\"]}");
	add("{\"term\":\"flamboyant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12515299\"]}");
	add("{\"term\":\"flame\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13502051\"]}");
	add("{\"term\":\"flamefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02575115\"]}");
	add("{\"term\":\"flameflower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11883304\", \"12458018\"]}");
	add("{\"term\":\"flamen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10114723\"]}");
	add("{\"term\":\"flamenco\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00534073\", \"07069441\"]}");
	add("{\"term\":\"flamethrower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03361405\"]}");
	add("{\"term\":\"flaming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13502051\"]}");
	add("{\"term\":\"flamingo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02010212\"]}");
	add("{\"term\":\"flaminius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10992487\"]}");
	add("{\"term\":\"flammability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04719844\"]}");
	add("{\"term\":\"flammulina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13042838\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }