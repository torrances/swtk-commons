package org.swtk.commons.dict.wordnet.byid.generated.p0.p0;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexById0002 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("00020270", "{\"term\":\"substance\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"00020270\", \"04941723\", \"06611268\", \"13374873\", \"14604577\", \"05928460\", \"05929717\", \"00019793\"]}");
	add("00021007", "{\"term\":\"matter\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06376912\", \"05176769\", \"05696202\", \"00021007\", \"05822417\", \"05679169\"]}");
	add("00021445", "{\"term\":\"food\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05819240\", \"07571428\", \"00021445\"]}");
	add("00021445", "{\"term\":\"nutrient\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00021914\", \"00021445\"]}");
	add("00021914", "{\"term\":\"nutrient\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00021914\", \"00021445\"]}");
	add("00022119", "{\"term\":\"artefact\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00022119\"]}");
	add("00022119", "{\"term\":\"artifact\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00022119\"]}");
	add("00023083", "{\"term\":\"article\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06335662\", \"06404578\", \"00023083\", \"06278749\"]}");
	add("00023280", "{\"term\":\"psychological feature\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00023280\"]}");
	add("00023451", "{\"term\":\"cognition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00023451\"]}");
	add("00023451", "{\"term\":\"knowledge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00023451\"]}");
	add("00023451", "{\"term\":\"noesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00023451\"]}");
	add("00023953", "{\"term\":\"motivation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00071461\", \"14602016\", \"00023953\"]}");
	add("00023953", "{\"term\":\"motive\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03794547\", \"07043169\", \"00023953\"]}");
	add("00023953", "{\"term\":\"need\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"14517300\", \"00023953\", \"09390888\", \"14472592\"]}");
	add("00024444", "{\"term\":\"attribute\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00024444\", \"05857567\"]}");
	add("00024900", "{\"term\":\"state\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"08154738\", \"08562388\", \"14011983\", \"14503199\", \"08185877\", \"08195465\", \"00024900\", \"08671935\"]}");
	add("00026390", "{\"term\":\"feeling\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05715665\", \"05730374\", \"05729447\", \"14549784\", \"05925333\", \"00026390\"]}");
	add("00027365", "{\"term\":\"location\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03687515\", \"00156307\", \"01053255\", \"00027365\"]}");
	add("00028005", "{\"term\":\"form\", \"synsetCount\":16, \"upperType\":\"NOUN\", \"ids\":[\"03389381\", \"03723460\", \"05207938\", \"08255384\", \"14503649\", \"04937655\", \"07106984\", \"08128123\", \"06485234\", \"04684871\", \"00028005\", \"05224424\", \"05071206\", \"05939522\", \"05847533\", \"06301417\"]}");
	add("00028005", "{\"term\":\"shape\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"05939522\", \"08191066\", \"14569829\", \"04684871\", \"05949928\", \"05224424\", \"00028005\", \"05071206\"]}");
	add("00028468", "{\"term\":\"time\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"15249488\", \"04998860\", \"15160774\", \"15154879\", \"07302920\", \"00028468\", \"15270326\", \"15147173\", \"15295388\", \"07324217\"]}");
	add("00028950", "{\"term\":\"infinite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00028950\"]}");
	add("00028950", "{\"term\":\"space\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"04037131\", \"06875252\", \"06401196\", \"15197259\", \"06852240\", \"08517454\", \"08670545\", \"13933399\", \"00028950\"]}");
	add("00029306", "{\"term\":\"absolute space\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00029306\"]}");
	add("00029413", "{\"term\":\"phase space\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00029413\"]}");
	add("00029677", "{\"term\":\"event\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11430739\", \"11474277\", \"13966452\", \"00029677\"]}");
	add("00029976", "{\"term\":\"physical process\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00029976\"]}");
	add("00029976", "{\"term\":\"process\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00029976\", \"05477841\", \"05709685\", \"06568683\", \"05709328\", \"01025762\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String ID) { 		return map.get(ID); 	}  	public boolean has(final String ID) { 		return map.containsKey(ID); 	} }