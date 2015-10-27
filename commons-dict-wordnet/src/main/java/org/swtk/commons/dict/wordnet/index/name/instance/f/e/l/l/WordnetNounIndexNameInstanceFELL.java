package org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFELL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fell\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00223243\", \"03331420\", \"14783454\"]}");
	add("{\"term\":\"fella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09927483\"]}");
	add("{\"term\":\"fellah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10103033\"]}");
	add("{\"term\":\"fellata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09724867\"]}");
	add("{\"term\":\"fellatio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00856798\"]}");
	add("{\"term\":\"fellation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00856798\"]}");
	add("{\"term\":\"feller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09927483\", \"10295742\"]}");
	add("{\"term\":\"fellini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10988393\"]}");
	add("{\"term\":\"felloe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03331605\"]}");
	add("{\"term\":\"fellow\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"09890770\", \"10103127\", \"10103295\", \"13765240\", \"09955448\", \"09965384\", \"09927483\"]}");
	add("{\"term\":\"fellowship\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13287371\", \"13952621\", \"08244837\"]}");
	add("{\"term\":\"felly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03331605\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }