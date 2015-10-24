package org.swtk.commons.dict.wiktionary.generated.g.i.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGIL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gilgai", "{\"term\":\"gilgai\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\"], \"text\":\"From \u0027gilgaay\u0027 (small water hole)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small concavity or depression between ridges, where rainwater gathers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1988\u0027\u0027, Tom Cole, \u0027Hell West and Crooked\u0027, Angus \u0026amp; Robertson, 1995, p.160\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Though it wasn′t a heavy storm it was enough to put water in \u0027\u0027gilgai\u0027\u0027 holes and scatter the horses\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Randall J. Schaetzl, Sharon Anderson, \u0027Soils: Genesis and Geomorphology\u0027, %22gilgais%22+-intitle:%22%22+-inauthor:%22%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dpkxdT-3sINGViQe-yKG-DQ\u0026amp;redir_esc\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"%22gilgais%22%20-intitle%3A%22%22%20-inauthor%3A%22%22\u0026amp;f\u003dfalse page 283\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Argilliturbation is manifested within Vertisol profiles and on the surface as \u0027\u0027gilgai\u0027\u0027 microtopography, with relief exceeding commonly 15 cm (Fig. 10.35\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Richard Webster, Margaret A. Oliver, \u0027Geostatistics for Environmental Scientists\u0027, %22gilgais%22+-intitle:%22%22+-inauthor:%22%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dpkxdT-3sINGViQe-yKG-DQ\u0026amp;redir_esc\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"%22gilgais%22%20-intitle%3A%22%22%20-inauthor%3A%22%22\u0026amp;f\u003dfalse page 140\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"One of its most remarkable features is its patterns of \u0027\u0027gilgai\u0027\u0027. The \u0027\u0027gilgais\u0027\u0027 are small, almost circular depressions from a few centimetres to as much as 50 cm deep in the plain and several metres across\", \"priority\":9}]}, \"synonyms\":{}}");

	add("gillnet", "{\"term\":\"gillnet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|gill|net|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A vertical net, often resting on the sea floor, which entangles fish in the netting, frequently by the gills\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gillyflower", "{\"term\":\"gillyflower\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\"], \"text\":\"By folk etymology, with influence from flower, from French \u0027girofle\u0027 \u0027gilofre\u0027 from \u0027\u0027 from Ancient greek (to 1453) \u0027καρυόφυλλον\u0027 (dried flower buds of the clove tree)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"clove pin\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any clove-scented flower\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any of several species of wallflower\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A variety of purplish-red apple with a roundish conical shape and a large core\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A stylized representation of a carnation blossom, usually red, and shown with or without a slip and leaves\", \"priority\":5}]}, \"synonyms\":{}}");

	add("gilyak", "{\"term\":\"gilyak\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Nivkh\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }