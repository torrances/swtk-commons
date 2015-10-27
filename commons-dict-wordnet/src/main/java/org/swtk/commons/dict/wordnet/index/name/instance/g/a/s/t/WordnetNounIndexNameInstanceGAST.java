package org.swtk.commons.dict.wordnet.index.name.instance.g.a.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gasteromycete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13060109\"]}");
	add("{\"term\":\"gasteromycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13059704\"]}");
	add("{\"term\":\"gasterophilidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02196009\"]}");
	add("{\"term\":\"gasterophilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02196148\"]}");
	add("{\"term\":\"gasteropoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01944311\"]}");
	add("{\"term\":\"gasterosteidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01457343\"]}");
	add("{\"term\":\"gasterosteus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01457782\"]}");
	add("{\"term\":\"gastralgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14350671\"]}");
	add("{\"term\":\"gastrectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00676003\"]}");
	add("{\"term\":\"gastrin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05416251\"]}");
	add("{\"term\":\"gastritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14369821\"]}");
	add("{\"term\":\"gastroboletus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13069426\"]}");
	add("{\"term\":\"gastrocnemius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05582264\"]}");
	add("{\"term\":\"gastrocybe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13068466\"]}");
	add("{\"term\":\"gastroenteritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14195487\"]}");
	add("{\"term\":\"gastroenterologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10141457\"]}");
	add("{\"term\":\"gastroenterology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06060021\"]}");
	add("{\"term\":\"gastroenterostomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00676107\"]}");
	add("{\"term\":\"gastrogavage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01060639\"]}");
	add("{\"term\":\"gastrolobium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12550410\"]}");
	add("{\"term\":\"gastromy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00678962\"]}");
	add("{\"term\":\"gastromycete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13060109\"]}");
	add("{\"term\":\"gastromycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13059704\"]}");
	add("{\"term\":\"gastronome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10081464\"]}");
	add("{\"term\":\"gastronomy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00938112\", \"07587771\"]}");
	add("{\"term\":\"gastrophryne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01655491\"]}");
	add("{\"term\":\"gastropod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01944818\"]}");
	add("{\"term\":\"gastropoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01944311\"]}");
	add("{\"term\":\"gastroscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03431372\"]}");
	add("{\"term\":\"gastroscopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00644005\"]}");
	add("{\"term\":\"gastrostomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00676307\"]}");
	add("{\"term\":\"gastrula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01465185\"]}");
	add("{\"term\":\"gastrulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13507874\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }