package org.swtk.commons.dict.wiktionary.generated.j.u.l;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJUL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("july", "{\"term\":\"july\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Middle english (1100-1500) {{m|enm|iulius}}, from Anglo-norman {{m|fro|julie}}, from Old french (842-ca. 1400) {{m|fro|jule}}, from Latin {{m|la|iūlius}} ({{w|Julius Caesar|Gaius Julius Caesar}}\u0027s month), perhaps a contraction of *\u0027Iovilios\u0027, \u0026quot;descended from Jove\u0026quot;, from Latin {{m|la|Iuppiter}}, from Proto-indo-european *\u0027dyeu-pəter-\u0027, vocative case of \u0027\u0027godfather\u0027\u0027, from Proto-Indo-European *\u0027deiw-os\u0027, god, + *\u0027pəter\u0027, father\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The seventh month of the Gregorian calendar, following June and preceding August. Abbreviation: \u0027\u0027Jul\u0027\u0027 or \u0027\u0027Jul\", \"priority\":1}]}, \"synonyms\":{}}");

	add("julia", "{\"term\":\"julia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|Iūlia}}, feminine form of the Roman gens name {{m|la|Iūlius}}. Further popularized by early Christian saints.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Salute Philologus, and \u0027\u0027Julia\u0027\u0027, Nereus, and his sister, and Olympas, and all the saints which are with them\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1826\u0027\u0027 \u0027The New-York Literary Gazette and American Athenaeum\u0027, July 8, 1826, J.G.Brooks\u0026amp;G.Bond, page 216\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027\u0027Julia\u0027\u0027!\u0026quot; when alone he would exclaim; \u0026quot;what a sweet sounding and romantic name: \u0027\u0027Julia\u0027\u0027! what music and magic in its sound! \u0027tis a name worthy only the fairest and purest of creation\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027 w:Luanne Luanne Rice, \u0027Follow the Stars Home\u0027, Bantam Books, ISBN 055311073X, page 93\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;Why did you name her \u0027\u0027Julia\u0027\u0027?\u0026quot; Amy asked, letting the orange ice cream melt down the backs of her hands\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"quot;Because it sounds dignified.\u0026quot\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Short for , a main belt asteroid; named for Saint\", \"priority\":7}]}, \"synonyms\":{}}");

	add("julius", "{\"term\":\"julius\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027iulius\u0027 of uncertain origin, possibly from Ancient greek (to 1453) \u0027ioulos\u0027 \u0027wooly first beard hairs\u0027, i.e. the young, or from Latin \u0027Jovilius\u0027 \u0027devoted to Jove\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"And when it was determined that we should sail into Italy, they delivered Paul and certain other prisoners unto one named \u0027\u0027Julius\u0027\u0027, a centurion of Augustus\u0027 band\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }